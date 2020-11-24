package typings.siesta.Siesta.Harness

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IBrowserExtJSCore extends js.Object {
  
  var coverageUnit: String = js.native
  
  var excludeCoverageUnits: RegExp = js.native
  
  var installLoaderInstrumentationHook: Boolean = js.native
}
object IBrowserExtJSCore {
  
  @scala.inline
  def apply(coverageUnit: String, excludeCoverageUnits: RegExp, installLoaderInstrumentationHook: Boolean): IBrowserExtJSCore = {
    val __obj = js.Dynamic.literal(coverageUnit = coverageUnit.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserExtJSCore]
  }
  
  @scala.inline
  implicit class IBrowserExtJSCoreOps[Self <: IBrowserExtJSCore] (val x: Self) extends AnyVal {
    
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
    def setCoverageUnit(value: String): Self = this.set("coverageUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCoverageUnits(value: RegExp): Self = this.set("excludeCoverageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallLoaderInstrumentationHook(value: Boolean): Self = this.set("installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
  }
}
