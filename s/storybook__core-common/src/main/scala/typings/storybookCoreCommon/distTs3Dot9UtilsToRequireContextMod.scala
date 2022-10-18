package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.Match
import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsToRequireContextMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/to-require-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toRequireContext(specifier: NormalizedStoriesSpecifier): Match = ^.asInstanceOf[js.Dynamic].applyDynamic("toRequireContext")(specifier.asInstanceOf[js.Any]).asInstanceOf[Match]
  
  inline def toRequireContextString(specifier: NormalizedStoriesSpecifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRequireContextString")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
}
