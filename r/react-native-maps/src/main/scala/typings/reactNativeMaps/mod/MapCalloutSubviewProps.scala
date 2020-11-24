package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapCalloutSubviewProps extends ViewProps {
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[`1`], Unit]] = js.native
}
object MapCalloutSubviewProps {
  
  @scala.inline
  def apply(): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
  
  @scala.inline
  implicit class MapCalloutSubviewPropsOps[Self <: MapCalloutSubviewProps] (val x: Self) extends AnyVal {
    
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
    def setOnPress(value: /* event */ MapEvent[`1`] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
  }
}
