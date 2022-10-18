package typings.storybookCoreCommon

import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsToImportFnMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/to-importFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toImportFn(stories: js.Array[NormalizedStoriesSpecifier]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toImportFn")(stories.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toImportFnPart(specifier: NormalizedStoriesSpecifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toImportFnPart")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def webpackIncludeRegexp(specifier: NormalizedStoriesSpecifier): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("webpackIncludeRegexp")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
