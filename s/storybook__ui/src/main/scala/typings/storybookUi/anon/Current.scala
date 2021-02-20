package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends StObject {
  
  var current: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['current'] */ js.Any = js.native
  
  var latest: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['latest'] */ js.Any = js.native
}
object Current {
  
  @scala.inline
  def apply(
    current: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['current'] */ js.Any,
    latest: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['latest'] */ js.Any
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['current'] */ js.Any
    ): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['latest'] */ js.Any
    ): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
  }
}
