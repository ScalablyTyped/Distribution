package typings.sentryTypes.integrationMod

import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integration extends js.Object {
  
  /**
    * Returns {@link IntegrationClass.id}
    */
  var name: String = js.native
  
  /**
    * Sets the integration up only once.
    * This takes no options on purpose, options should be passed in the constructor
    */
  def setupOnce(
    addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
    getCurrentHub: js.Function0[Hub]
  ): Unit = js.native
}
object Integration {
  
  @scala.inline
  def apply(
    name: String,
    setupOnce: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit
  ): Integration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setupOnce = js.Any.fromFunction2(setupOnce))
    __obj.asInstanceOf[Integration]
  }
  
  @scala.inline
  implicit class IntegrationOps[Self <: Integration] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupOnce(value: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit): Self = this.set("setupOnce", js.Any.fromFunction2(value))
  }
}
