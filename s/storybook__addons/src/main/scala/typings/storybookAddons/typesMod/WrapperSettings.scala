package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperSettings extends js.Object {
  var options: OptionsParameter
  var parameters: StringDictionary[js.Any]
}

object WrapperSettings {
  @scala.inline
  def apply(options: OptionsParameter, parameters: StringDictionary[js.Any]): WrapperSettings = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrapperSettings]
  }
}

