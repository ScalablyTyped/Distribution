package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.TranslatableExposed
import typings.reactInstantsearchCore.mod.TranslatableProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "translatable")
@js.native
object translatable extends js.Object {
  def apply(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = js.native
}

