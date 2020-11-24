package typings.rcSelect.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcSelect.generatorMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionData
  extends OptionCoreData
     with /** Save for customize data */
/* prop */ StringDictionary[js.Any]
object OptionData {
  
  @scala.inline
  def apply(value: Key): OptionData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}
