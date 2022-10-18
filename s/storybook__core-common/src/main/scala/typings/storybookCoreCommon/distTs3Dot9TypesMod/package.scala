package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.std.Record
import typings.storybookCoreCommon.anon.Disable
import typings.storybookCoreCommon.anon.Name
import typings.storybookCoreCommon.anon.NameOptions
import typings.storybookCoreCommon.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.storybookCoreCommon.distTs3Dot9TypesMod.BuilderName
  - typings.storybookCoreCommon.distTs3Dot9TypesMod.BuilderConfigObject
  - typings.storybookCoreCommon.distTs3Dot9TypesMod.Webpack4BuilderConfig
  - typings.storybookCoreCommon.distTs3Dot9TypesMod.Webpack5BuilderConfig
*/
type BuilderConfig = _BuilderConfig | String

/* Rewritten from type alias, can be one of: 
  - typings.storybookCoreCommon.storybookCoreCommonStrings.webpack4
  - typings.storybookCoreCommon.storybookCoreCommonStrings.webpack5
  - java.lang.String
*/
type BuilderName = _BuilderName | String

type Entry = String

type Preset = String | Name

type PresetConfig = String | NameOptions

type StoriesEntry = String | StoriesSpecifier

type StorybookRefs = Record[String, Title | Disable]
