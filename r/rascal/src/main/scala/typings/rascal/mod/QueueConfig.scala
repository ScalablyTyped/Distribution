package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.AssertQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueConfig extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.native
  
  var check: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[AssertQueue] = js.native
}
object QueueConfig {
  
  @scala.inline
  def apply(): QueueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueConfig]
  }
  
  @scala.inline
  implicit class QueueConfigMutableBuilder[Self <: QueueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setOptions(value: AssertQueue): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
