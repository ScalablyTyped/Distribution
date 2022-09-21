package typings.std

import typings.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContext
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val audioWorklet: AudioWorklet = js.native
  
  /* standard dom */
  def createAnalyser(): AnalyserNode = js.native
  
  /* standard dom */
  def createBiquadFilter(): BiquadFilterNode = js.native
  
  /* standard dom */
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): AudioBuffer = js.native
  
  /* standard dom */
  def createBufferSource(): AudioBufferSourceNode = js.native
  
  /* standard dom */
  def createChannelMerger(): ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): ChannelMergerNode = js.native
  
  /* standard dom */
  def createChannelSplitter(): ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): ChannelSplitterNode = js.native
  
  /* standard dom */
  def createConstantSource(): ConstantSourceNode = js.native
  
  /* standard dom */
  def createConvolver(): ConvolverNode = js.native
  
  /* standard dom */
  def createDelay(): DelayNode = js.native
  def createDelay(maxDelayTime: Double): DelayNode = js.native
  
  /* standard dom */
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native
  
  /* standard dom */
  def createGain(): GainNode = js.native
  
  /* standard dom */
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  /* standard dom.iterable */
  def createIIRFilter(feedforward: js.Iterable[Double], feedback: js.Iterable[Double]): IIRFilterNode = js.native
  
  /* standard dom */
  def createOscillator(): OscillatorNode = js.native
  
  /* standard dom */
  def createPanner(): PannerNode = js.native
  
  /* standard dom */
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  /* standard dom.iterable */
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): PeriodicWave = js.native
  def createPeriodicWave(
    real: js.typedarray.Float32Array,
    imag: js.typedarray.Float32Array,
    constraints: PeriodicWaveConstraints
  ): PeriodicWave = js.native
  
  /** @deprecated */
  /* standard dom */
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  
  /* standard dom */
  def createStereoPanner(): StereoPannerNode = js.native
  
  /* standard dom */
  def createWaveShaper(): WaveShaperNode = js.native
  
  /* standard dom */
  val currentTime: Double = js.native
  
  /* standard dom */
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Unit, errorCallback: DecodeErrorCallback): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(
    audioData: js.typedarray.ArrayBuffer,
    successCallback: DecodeSuccessCallback,
    errorCallback: DecodeErrorCallback
  ): js.Promise[AudioBuffer] = js.native
  
  /* standard dom */
  val destination: AudioDestinationNode = js.native
  
  /* standard dom */
  val listener: AudioListener = js.native
  
  /* standard dom */
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val sampleRate: Double = js.native
  
  /* standard dom */
  val state: AudioContextState = js.native
}
