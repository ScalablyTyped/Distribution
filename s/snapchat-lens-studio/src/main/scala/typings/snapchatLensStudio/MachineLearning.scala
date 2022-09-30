package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace for Machine Learning related classes and methods. For more information, see the Machine Learning Overview. */
object MachineLearning {
  
  @js.native
  sealed trait FrameTiming extends StObject
  /** Timing options for when MLComponent should start or stop running. Used with MLComponent.runScheduled(). For more information, see the MLComponent Scripting guide. */
  @JSGlobal("MachineLearning.FrameTiming")
  @js.native
  object FrameTiming extends StObject {
    
    /** Run in MLComponent LateUpdate, after all scripts update, but before they get LateUpdate. */
    @js.native
    sealed trait LateUpdate
      extends StObject
         with FrameTiming
    
    /** Only valid as an end timing. There is no exact time specified when MLComponent should finish its run. */
    @js.native
    sealed trait None
      extends StObject
         with FrameTiming
    
    /** Run at a specific point during frame rendering. */
    @js.native
    sealed trait OnRender
      extends StObject
         with FrameTiming
    
    /** Run during MLComponent update, before script update. */
    @js.native
    sealed trait Update
      extends StObject
         with FrameTiming
  }
  
  @js.native
  sealed trait InferenceMode extends StObject
  /** Inference modes used by MLComponent.inferenceMode. Each mode describes how the neural network will be run. */
  @JSGlobal("MachineLearning.InferenceMode")
  @js.native
  object InferenceMode extends StObject {
    
    /** MLComponent will attempt to use a dedicated hardware accelerator to run the neural network. If the device doesn’t support it, GPU mode will be used instead. */
    @js.native
    sealed trait Accelerator
      extends StObject
         with InferenceMode
    
    /** MLComponent will automatically decide how to run the neural network based on what is supported. It will start with Accelerator, then fall back to GPU, then CPU. */
    @js.native
    sealed trait Auto
      extends StObject
         with InferenceMode
    
    /** MLComponent will run the neural network on CPU. Available on all devices. */
    @js.native
    sealed trait CPU
      extends StObject
         with InferenceMode
    
    /** MLComponent will attempt to run the neural network on GPU. If the device doesn’t support it, CPU mode will be used instead. */
    @js.native
    sealed trait GPU
      extends StObject
         with InferenceMode
  }
  
  @js.native
  sealed trait ModelState extends StObject
  /** Describes the current state of the MLComponent model. For more information, see the MLComponent Scripting guide. */
  @JSGlobal("MachineLearning.ModelState")
  @js.native
  object ModelState extends StObject {
    
    /** Model is built and ready to run */
    @js.native
    sealed trait Idle
      extends StObject
         with ModelState
    
    /** Model is loading */
    @js.native
    sealed trait Loading
      extends StObject
         with ModelState
    
    /** Model is not ready to run */
    @js.native
    sealed trait NotReady
      extends StObject
         with ModelState
    
    /** Model is running */
    @js.native
    sealed trait Running
      extends StObject
         with ModelState
  }
  
  @js.native
  sealed trait OutputMode extends StObject
  /**
    * Types of output used by OutputPlaceholder.
    * ```
    * //@input Component.MLComponent mlComponent
    * //@input string outputName
    * //@input Component.Image outputImage
    *
    * script.mlComponent.onLoadingFinished = onLoadingFinished;
    *
    * function onLoadingFinished() {
    *     var output = script.mlComponent.getOutput(script.outputName);
    *     if (output.mode == MachineLearning.OutputMode.Data) {
    *         var outputData = output.data;
    *         for (var i = 0; i < outputData.length; i++) {
    *             print(outputData[i]);
    *         }
    *     } else {
    *         var texture = output.texture;
    *         script.outputImage.mainPass.baseTex = texture;
    *     }
    * }
    * //@input vec2 outputSize = {1, 1}
    * //@input string outputName = "probs"
    *
    * var outputChannels = 200;
    *
    * var outputBuilder = MachineLearning.createOutputBuilder();
    * outputBuilder.setName(script.outputName);
    * outputBuilder.setShape(new vec3(script.outputSize.x, script.outputSize.y, outputChannels));
    * outputBuilder.setOutputMode(MachineLearning.OutputMode.Data);
    * var outputPlaceholder = outputBuilder.build();
    * ```
    */
  @JSGlobal("MachineLearning.OutputMode")
  @js.native
  object OutputMode extends StObject {
    
    /** The output will be in the form of a Float32Array. */
    @js.native
    sealed trait Data
      extends StObject
         with OutputMode
    
    /** The output will be in the form of a Texture. */
    @js.native
    sealed trait Texture
      extends StObject
         with OutputMode
  }
}
