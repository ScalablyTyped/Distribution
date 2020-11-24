package typings.reactNativeFirebase.mod.RNFirebase.links

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinksStatics extends js.Object {
  
  var DynamicLink: Instantiable2[
    /* link */ String, 
    /* domainURIPrefix */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.links.DynamicLink
  ] = js.native
}
object LinksStatics {
  
  @scala.inline
  def apply(DynamicLink: Instantiable2[/* link */ String, /* domainURIPrefix */ String, DynamicLink]): LinksStatics = {
    val __obj = js.Dynamic.literal(DynamicLink = DynamicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksStatics]
  }
  
  @scala.inline
  implicit class LinksStaticsOps[Self <: LinksStatics] (val x: Self) extends AnyVal {
    
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
    def setDynamicLink(value: Instantiable2[/* link */ String, /* domainURIPrefix */ String, DynamicLink]): Self = this.set("DynamicLink", value.asInstanceOf[js.Any])
  }
}
