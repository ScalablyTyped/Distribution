package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAudioContext extends EventTarget {
  val audioWorklet: AudioWorklet = js.native
  val currentTime: scala.Double = js.native
  val destination: AudioDestinationNode = js.native
  val listener: AudioListener = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val sampleRate: scala.Double = js.native
  val state: AudioContextState = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def createAnalyser(): AnalyserNode = js.native
  def createBiquadFilter(): BiquadFilterNode = js.native
  def createBuffer(numberOfChannels: scala.Double, length: scala.Double, sampleRate: scala.Double): AudioBuffer = js.native
  def createBufferSource(): AudioBufferSourceNode = js.native
  def createChannelMerger(): ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: scala.Double): ChannelMergerNode = js.native
  def createChannelSplitter(): ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: scala.Double): ChannelSplitterNode = js.native
  def createConstantSource(): ConstantSourceNode = js.native
  def createConvolver(): ConvolverNode = js.native
  def createDelay(): DelayNode = js.native
  def createDelay(maxDelayTime: scala.Double): DelayNode = js.native
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native
  def createGain(): GainNode = js.native
  def createIIRFilter(feedforward: Array[scala.Double], feedback: Array[scala.Double]): IIRFilterNode = js.native
  def createOscillator(): OscillatorNode = js.native
  def createPanner(): PannerNode = js.native
  def createPeriodicWave(real: Array[scala.Double], imag: Array[scala.Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Array[scala.Double], imag: Array[scala.Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Array[scala.Double], imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: Array[scala.Double], imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Array[scala.Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Array[scala.Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: scala.Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: scala.Double, numberOfInputChannels: scala.Double): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: scala.Double,
    numberOfInputChannels: scala.Double,
    numberOfOutputChannels: scala.Double
  ): ScriptProcessorNode = js.native
  def createStereoPanner(): StereoPannerNode = js.native
  def createWaveShaper(): WaveShaperNode = js.native
  def decodeAudioData(audioData: ArrayBuffer): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback, errorCallback: DecodeErrorCallback): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: scala.Null, errorCallback: DecodeErrorCallback): Promise[AudioBuffer] = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def resume(): Promise[scala.Unit] = js.native
}

@JSGlobal("BaseAudioContext")
@js.native
object BaseAudioContext
  extends org.scalablytyped.runtime.Instantiable0[BaseAudioContext]

