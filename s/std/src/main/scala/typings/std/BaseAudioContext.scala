package typings.std

import typings.std.stdStrings.statechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAudioContext extends EventTarget {
  val audioWorklet: AudioWorklet = js.native
  val currentTime: Double = js.native
  val destination: AudioDestinationNode = js.native
  val listener: AudioListener = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val sampleRate: Double = js.native
  val state: AudioContextState = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def createAnalyser(): AnalyserNode = js.native
  def createBiquadFilter(): BiquadFilterNode = js.native
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): AudioBuffer = js.native
  def createBufferSource(): AudioBufferSourceNode = js.native
  def createChannelMerger(): ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): ChannelMergerNode = js.native
  def createChannelSplitter(): ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): ChannelSplitterNode = js.native
  def createConstantSource(): ConstantSourceNode = js.native
  def createConvolver(): ConvolverNode = js.native
  def createDelay(): DelayNode = js.native
  def createDelay(maxDelayTime: Double): DelayNode = js.native
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native
  def createGain(): GainNode = js.native
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  def createIIRFilter(feedforward: Iterable[Double], feedback: Iterable[Double]): IIRFilterNode = js.native
  def createOscillator(): OscillatorNode = js.native
  def createPanner(): PannerNode = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: js.Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createStereoPanner(): StereoPannerNode = js.native
  def createWaveShaper(): WaveShaperNode = js.native
  def decodeAudioData(audioData: ArrayBuffer): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback, errorCallback: DecodeErrorCallback): js.Promise[AudioBuffer] = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

