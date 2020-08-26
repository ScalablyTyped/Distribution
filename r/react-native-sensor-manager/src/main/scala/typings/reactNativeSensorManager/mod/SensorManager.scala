package typings.reactNativeSensorManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorManager extends js.Object {
  def startAccelerometer(delay: Double): Unit = js.native
  def startGyroscope(delay: Double): Unit = js.native
  def startLightSensor(delay: Double): Unit = js.native
  def startMagnetometer(delay: Double): Unit = js.native
  def startMotionValue(delay: Double): Unit = js.native
  def startOrientation(delay: Double): Unit = js.native
  def startProximity(delay: Double): Unit = js.native
  def startStepCounter(delay: Double): Unit = js.native
  def startThermometer(delay: Double): Unit = js.native
  def stopAccelerometer(): Unit = js.native
  def stopGyroscope(): Unit = js.native
  def stopLightSensor(): Unit = js.native
  def stopMagnetometer(): Unit = js.native
  def stopMotionValue(): Unit = js.native
  def stopOrientation(): Unit = js.native
  def stopProximity(): Unit = js.native
  def stopStepCounter(): Unit = js.native
  def stopThermometer(): Unit = js.native
}

object SensorManager {
  @scala.inline
  def apply(
    startAccelerometer: Double => Unit,
    startGyroscope: Double => Unit,
    startLightSensor: Double => Unit,
    startMagnetometer: Double => Unit,
    startMotionValue: Double => Unit,
    startOrientation: Double => Unit,
    startProximity: Double => Unit,
    startStepCounter: Double => Unit,
    startThermometer: Double => Unit,
    stopAccelerometer: () => Unit,
    stopGyroscope: () => Unit,
    stopLightSensor: () => Unit,
    stopMagnetometer: () => Unit,
    stopMotionValue: () => Unit,
    stopOrientation: () => Unit,
    stopProximity: () => Unit,
    stopStepCounter: () => Unit,
    stopThermometer: () => Unit
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
    __obj.asInstanceOf[SensorManager]
  }
  @scala.inline
  implicit class SensorManagerOps[Self <: SensorManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStartAccelerometer(value: Double => Unit): Self = this.set("startAccelerometer", js.Any.fromFunction1(value))
    @scala.inline
    def setStartGyroscope(value: Double => Unit): Self = this.set("startGyroscope", js.Any.fromFunction1(value))
    @scala.inline
    def setStartLightSensor(value: Double => Unit): Self = this.set("startLightSensor", js.Any.fromFunction1(value))
    @scala.inline
    def setStartMagnetometer(value: Double => Unit): Self = this.set("startMagnetometer", js.Any.fromFunction1(value))
    @scala.inline
    def setStartMotionValue(value: Double => Unit): Self = this.set("startMotionValue", js.Any.fromFunction1(value))
    @scala.inline
    def setStartOrientation(value: Double => Unit): Self = this.set("startOrientation", js.Any.fromFunction1(value))
    @scala.inline
    def setStartProximity(value: Double => Unit): Self = this.set("startProximity", js.Any.fromFunction1(value))
    @scala.inline
    def setStartStepCounter(value: Double => Unit): Self = this.set("startStepCounter", js.Any.fromFunction1(value))
    @scala.inline
    def setStartThermometer(value: Double => Unit): Self = this.set("startThermometer", js.Any.fromFunction1(value))
    @scala.inline
    def setStopAccelerometer(value: () => Unit): Self = this.set("stopAccelerometer", js.Any.fromFunction0(value))
    @scala.inline
    def setStopGyroscope(value: () => Unit): Self = this.set("stopGyroscope", js.Any.fromFunction0(value))
    @scala.inline
    def setStopLightSensor(value: () => Unit): Self = this.set("stopLightSensor", js.Any.fromFunction0(value))
    @scala.inline
    def setStopMagnetometer(value: () => Unit): Self = this.set("stopMagnetometer", js.Any.fromFunction0(value))
    @scala.inline
    def setStopMotionValue(value: () => Unit): Self = this.set("stopMotionValue", js.Any.fromFunction0(value))
    @scala.inline
    def setStopOrientation(value: () => Unit): Self = this.set("stopOrientation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopProximity(value: () => Unit): Self = this.set("stopProximity", js.Any.fromFunction0(value))
    @scala.inline
    def setStopStepCounter(value: () => Unit): Self = this.set("stopStepCounter", js.Any.fromFunction0(value))
    @scala.inline
    def setStopThermometer(value: () => Unit): Self = this.set("stopThermometer", js.Any.fromFunction0(value))
  }
  
}

