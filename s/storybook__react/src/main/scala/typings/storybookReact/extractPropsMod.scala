package typings.storybookReact

import org.scalablytyped.runtime.StringDictionary
import typings.storybookDocsTools.docgenTypesMod.PropsExtractor
import typings.storybookDocsTools.propDefMod.PropDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractPropsMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/extractProps", "extractProps")
  @js.native
  val extractProps: PropsExtractor = js.native
  
  type PropDefMap = StringDictionary[PropDef]
}
