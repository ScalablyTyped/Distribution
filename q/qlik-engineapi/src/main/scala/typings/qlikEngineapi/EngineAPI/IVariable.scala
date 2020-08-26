package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at variable level.
  *
  * Note: Methods in this class are deprecated. Use methods in the GenericVariable class instead.
  *
  * The handle member in the JSON request for all methods listed in this section is the handle of the variable.
  */
@js.native
trait IVariable extends IGeneratedAPI {
  /**
    * Sets the value of a dual variable overriding any input constraints.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    * Note: The ForceContent method does not evaluate any expression.
    * @param qs - String representation of a dual value.
    * Set this parameter to "", if the string representation is to be Null.
    * >> This parameter is mandatory.
    * @param qd - Numeric representation of a dual value.
    * >> This parameter is mandatory.
    */
  def forceContent(qs: String, qd: Double): js.Promise[Unit] = js.native
  /**
    * Returns the calculated value of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getContent(): js.Promise[IAlfaNumString] = js.native
  /**
    * Gets the properties of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getNxProperties(): js.Promise[INxVariableProperties] = js.native
  /**
    * Returns the raw value of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getRawContent(): js.Promise[String] = js.native
  /**
    * Sets a value to a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    * @param qContent - Value of the variable.
    * >> This parameter is mandatory.
    * @param qUpdateMRU - If set to true, the value is added to the Most Recently Used (MRU) list.
    * >> This parameter is mandatory.
    */
  def setContent(qContent: String, qUpdateMRU: Boolean): js.Promise[Boolean] = js.native
  /**
    * Sets some properties to a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    *
    * In addition to the properties described below, dynamic properties can be added.
    * @param qProperties - Information about the properties of the variable
    */
  def setNxProperties(qProperties: INxVariableProperties): js.Promise[Unit] = js.native
}

object IVariable {
  @scala.inline
  def apply(
    forceContent: (String, Double) => js.Promise[Unit],
    getContent: () => js.Promise[IAlfaNumString],
    getNxProperties: () => js.Promise[INxVariableProperties],
    getRawContent: () => js.Promise[String],
    setContent: (String, Boolean) => js.Promise[Boolean],
    setNxProperties: INxVariableProperties => js.Promise[Unit]
  ): IVariable = {
    val __obj = js.Dynamic.literal(forceContent = js.Any.fromFunction2(forceContent), getContent = js.Any.fromFunction0(getContent), getNxProperties = js.Any.fromFunction0(getNxProperties), getRawContent = js.Any.fromFunction0(getRawContent), setContent = js.Any.fromFunction2(setContent), setNxProperties = js.Any.fromFunction1(setNxProperties))
    __obj.asInstanceOf[IVariable]
  }
  @scala.inline
  implicit class IVariableOps[Self <: IVariable] (val x: Self) extends AnyVal {
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
    def setForceContent(value: (String, Double) => js.Promise[Unit]): Self = this.set("forceContent", js.Any.fromFunction2(value))
    @scala.inline
    def setGetContent(value: () => js.Promise[IAlfaNumString]): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNxProperties(value: () => js.Promise[INxVariableProperties]): Self = this.set("getNxProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRawContent(value: () => js.Promise[String]): Self = this.set("getRawContent", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: (String, Boolean) => js.Promise[Boolean]): Self = this.set("setContent", js.Any.fromFunction2(value))
    @scala.inline
    def setSetNxProperties(value: INxVariableProperties => js.Promise[Unit]): Self = this.set("setNxProperties", js.Any.fromFunction1(value))
  }
  
}

