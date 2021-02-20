package typings.rcCascader

import typings.rcCascader.cascaderMod.CascaderProps
import typings.rcCascader.cascaderMod.CascaderState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcCascader.cascaderMod.default {
    def this(props: CascaderProps) = this()
  }
  object default {
    
    @JSImport("rc-cascader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-cascader", "default.defaultProps")
    @js.native
    def defaultProps: CascaderProps = js.native
    @scala.inline
    def defaultProps_=(x: CascaderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("rc-cascader", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: CascaderProps, prevState: CascaderState): CascaderState = js.native
  }
}
