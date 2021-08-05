package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdLayout.layoutProviderMod.LayoutProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LayoutProvider {
  
  inline def apply(
    hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren: LayoutProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "LayoutProvider")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "LayoutProvider.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "LayoutProvider.propTypes.baseId")
    @js.native
    def baseId: js.Any = js.native
    inline def baseId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseId")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.desktopLayout")
    @js.native
    def desktopLayout: js.Any = js.native
    inline def desktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLayout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.landscapeTabletLayout")
    @js.native
    def landscapeTabletLayout: js.Any = js.native
    inline def landscapeTabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscapeTabletLayout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.largeDesktopLayout")
    @js.native
    def largeDesktopLayout: js.Any = js.native
    inline def largeDesktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeDesktopLayout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.phoneLayout")
    @js.native
    def phoneLayout: js.Any = js.native
    inline def phoneLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneLayout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "LayoutProvider.propTypes.tabletLayout")
    @js.native
    def tabletLayout: js.Any = js.native
    inline def tabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletLayout")(x.asInstanceOf[js.Any])
  }
}
