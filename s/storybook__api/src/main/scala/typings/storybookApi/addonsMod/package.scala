package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object addonsMod {
  
  type Collection[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Panels = typings.storybookApi.addonsMod.Collection[typings.storybookApi.addonsMod.Addon]
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type Types_ = typings.storybookApi.addonsMod.types | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.story
    - typings.storybookApi.storybookApiStrings.info
    - typings.storybookApi.storybookApiStrings.settings
    - typings.storybookApi.storybookApiStrings.page
    - js.UndefOr[scala.Nothing]
    - java.lang.String
  */
  type ViewMode = js.UndefOr[typings.storybookApi.addonsMod._ViewMode | java.lang.String]
}
