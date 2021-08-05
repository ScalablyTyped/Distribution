package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdUtils.dirMod.DirProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dir {
  
  inline def apply(hasChildrenDefaultDir: DirProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenDefaultDir.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "Dir")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "Dir.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "Dir.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "Dir.propTypes.defaultDir")
    @js.native
    def defaultDir: js.Any = js.native
    inline def defaultDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDir")(x.asInstanceOf[js.Any])
  }
}
