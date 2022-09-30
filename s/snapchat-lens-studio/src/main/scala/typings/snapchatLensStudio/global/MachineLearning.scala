package typings.snapchatLensStudio.global

import typings.snapchatLensStudio.InputBuilder
import typings.snapchatLensStudio.OutputBuilder
import typings.snapchatLensStudio.TransformerBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace for Machine Learning related classes and methods. For more information, see the Machine Learning Overview. */
object MachineLearning {
  
  @JSGlobal("MachineLearning")
  @js.native
  val ^ : js.Any = js.native
  
  /** Timing options for when MLComponent should start or stop running. Used with MLComponent.runScheduled(). For more information, see the MLComponent Scripting guide. */
  @JSGlobal("MachineLearning.FrameTiming")
  @js.native
  object FrameTiming extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.MachineLearning.FrameTiming & Double] = js.native
    
    /* 2 */ val LateUpdate: typings.snapchatLensStudio.MachineLearning.FrameTiming.LateUpdate & Double = js.native
    
    /* 0 */ val None: typings.snapchatLensStudio.MachineLearning.FrameTiming.None & Double = js.native
    
    /* 3 */ val OnRender: typings.snapchatLensStudio.MachineLearning.FrameTiming.OnRender & Double = js.native
    
    /* 1 */ val Update: typings.snapchatLensStudio.MachineLearning.FrameTiming.Update & Double = js.native
  }
  
  /** Inference modes used by MLComponent.inferenceMode. Each mode describes how the neural network will be run. */
  @JSGlobal("MachineLearning.InferenceMode")
  @js.native
  object InferenceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.MachineLearning.InferenceMode & Double] = js.native
    
    /* 2 */ val Accelerator: typings.snapchatLensStudio.MachineLearning.InferenceMode.Accelerator & Double = js.native
    
    /* 3 */ val Auto: typings.snapchatLensStudio.MachineLearning.InferenceMode.Auto & Double = js.native
    
    /* 0 */ val CPU: typings.snapchatLensStudio.MachineLearning.InferenceMode.CPU & Double = js.native
    
    /* 1 */ val GPU: typings.snapchatLensStudio.MachineLearning.InferenceMode.GPU & Double = js.native
  }
  
  /** Describes the current state of the MLComponent model. For more information, see the MLComponent Scripting guide. */
  @JSGlobal("MachineLearning.ModelState")
  @js.native
  object ModelState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.MachineLearning.ModelState & Double] = js.native
    
    /* 2 */ val Idle: typings.snapchatLensStudio.MachineLearning.ModelState.Idle & Double = js.native
    
    /* 1 */ val Loading: typings.snapchatLensStudio.MachineLearning.ModelState.Loading & Double = js.native
    
    /* 3 */ val NotReady: typings.snapchatLensStudio.MachineLearning.ModelState.NotReady & Double = js.native
    
    /* 0 */ val Running: typings.snapchatLensStudio.MachineLearning.ModelState.Running & Double = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.MachineLearning.OutputMode & Double] = js.native
    
    /* 1 */ val Data: typings.snapchatLensStudio.MachineLearning.OutputMode.Data & Double = js.native
    
    /* 0 */ val Texture: typings.snapchatLensStudio.MachineLearning.OutputMode.Texture & Double = js.native
  }
  
  /** Creates a new InputBuilder object. */
  inline def createInputBuilder(): InputBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInputBuilder")().asInstanceOf[InputBuilder]
  
  /** Creates a new OutputBuilder object. */
  inline def createOutputBuilder(): OutputBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createOutputBuilder")().asInstanceOf[OutputBuilder]
  
  /** Creates a new TransformerBuilder object. */
  inline def createTransformerBuilder(): TransformerBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformerBuilder")().asInstanceOf[TransformerBuilder]
}
