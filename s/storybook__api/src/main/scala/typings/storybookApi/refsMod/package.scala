package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object refsMod {
  
  type RefId = java.lang.String
  
  type RefUrl = java.lang.String
  
  type Refs = typings.std.Record[java.lang.String, typings.storybookApi.refsMod.ComposedRef]
  
  type StoryMapper = js.Function2[
    /* ref */ typings.storybookApi.refsMod.ComposedRef, 
    /* story */ typings.storybookApi.storiesMod.StoryInput, 
    typings.storybookApi.storiesMod.StoryInput
  ]
  
  type Versions = typings.std.Record[java.lang.String, java.lang.String]
}
