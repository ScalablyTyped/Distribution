package typings.storybookDocsTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9SharedMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/shared", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybook/docs" */ String = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/shared", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/shared", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "docs" */ String = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/shared", "SNIPPET_RENDERED")
  @js.native
  val SNIPPET_RENDERED: String = js.native
  
  @js.native
  sealed trait SourceType extends StObject
  @JSImport("@storybook/docs-tools/dist/ts3.9/shared", "SourceType")
  @js.native
  object SourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SourceType & String] = js.native
    
    /**
      * AUTO is the default
      *
      * Use the CODE logic if:
      * - the user has set a custom source snippet in `docs.source.code` story parameter
      * - the story is not an args-based story
      *
      * Use the DYNAMIC rendered snippet if the story is an args story
      */
    @js.native
    sealed trait AUTO
      extends StObject
         with SourceType
    /* "auto" */ val AUTO: typings.storybookDocsTools.distTs3Dot9SharedMod.SourceType.AUTO & String = js.native
    
    /**
      * Render the code extracted by source-loader
      */
    @js.native
    sealed trait CODE
      extends StObject
         with SourceType
    /* "code" */ val CODE: typings.storybookDocsTools.distTs3Dot9SharedMod.SourceType.CODE & String = js.native
    
    /**
      * Render dynamically-rendered source snippet from the story's virtual DOM (currently React only)
      */
    @js.native
    sealed trait DYNAMIC
      extends StObject
         with SourceType
    /* "dynamic" */ val DYNAMIC: typings.storybookDocsTools.distTs3Dot9SharedMod.SourceType.DYNAMIC & String = js.native
  }
}
