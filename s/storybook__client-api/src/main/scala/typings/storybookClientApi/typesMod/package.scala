package typings.storybookClientApi.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArgTypesEnhancer = js.Function1[
/* context */ typings.storybookAddons.typesMod.StoryContext, 
typings.storybookAddons.typesMod.ArgTypes]

type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typings.storybookClientApi.typesMod.ClientApiAddon[StoryFnReturnType]]

type StoreData = org.scalablytyped.runtime.StringDictionary[typings.storybookClientApi.typesMod.StoreItem]

/* Rewritten from type alias, can be one of: 
  - typings.storybookAddons.typesMod.StoryId
  - typings.storybookClientApi.anon.Kind
  - typings.storybookClientApi.storybookClientApiStrings.Asterisk
*/
type StorySpecifier = typings.storybookClientApi.typesMod._StorySpecifier | typings.storybookAddons.typesMod.StoryId
