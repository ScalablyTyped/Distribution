package typings.smartwizard

import typings.smartwizard.JQuerySmartwizard.SmartWizardOptions
import typings.smartwizard.smartwizardStrings.disable
import typings.smartwizard.smartwizardStrings.getStepIndex
import typings.smartwizard.smartwizardStrings.goToStep
import typings.smartwizard.smartwizardStrings.hide
import typings.smartwizard.smartwizardStrings.leaveStep
import typings.smartwizard.smartwizardStrings.loader
import typings.smartwizard.smartwizardStrings.next
import typings.smartwizard.smartwizardStrings.prev
import typings.smartwizard.smartwizardStrings.reset
import typings.smartwizard.smartwizardStrings.setOptions
import typings.smartwizard.smartwizardStrings.show
import typings.smartwizard.smartwizardStrings.showStep
import typings.smartwizard.smartwizardStrings.stepContent
import typings.smartwizard.smartwizardStrings.stepState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def on(
    eventName: showStep | stepContent,
    callback: js.Function4[
      /* e */ Event, 
      /* anchorObject */ this.type, 
      /* stepIndex */ Double, 
      /* stepDirection */ String, 
      Unit
    ]
  ): Unit = js.native
  /**
    * The leaveStep event triggers just before leaving from a step. You can
    * cancel the event by returning false, so the navigation is also be
    * cancelled and the wizard will retain the current state.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#event-leavestep}
    */
  @JSName("on")
  def on_leaveStep(
    eventName: leaveStep,
    callback: js.Function5[
      /* e */ Event, 
      /* anchorObject */ this.type, 
      /* currentStepIndex */ Double, 
      /* nextStepIndex */ Double, 
      /* stepDirection */ String, 
      Unit
    ]
  ): Unit = js.native
  
  def smartWizard(): Unit = js.native
  def smartWizard(functionName: next | prev | reset): Unit = js.native
  /**
    * Allow you to show/hide the built-n loader animation.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-loader}
    */
  def smartWizard(functionName: loader, action: show | hide): Unit = js.native
  /**
    * Change the state of a step
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-stepstate}
    */
  def smartWizard(functionName: stepState, steps: js.Array[Double], action: disable | hide): Unit = js.native
  /**
    * Gets the current step index
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-getstepindex}
    */
  @JSName("smartWizard")
  def smartWizard_getStepIndex(functionName: getStepIndex): Double = js.native
  /**
    * Allow you to go to a certain step.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-gotostep}
    */
  @JSName("smartWizard")
  def smartWizard_goToStep(functionName: goToStep, step: Double): Unit = js.native
  /**
    * Allow you to set the options dynamically.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-setoptions}
    */
  @JSName("smartWizard")
  def smartWizard_setOptions(functionName: setOptions, options: SmartWizardOptions): Unit = js.native
}
