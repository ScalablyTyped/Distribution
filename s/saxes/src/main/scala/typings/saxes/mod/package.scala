package typings.saxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributeHandler[O] = js.Function1[/* attribute */ typings.saxes.mod.AttributeEventForOptions[O], scala.Unit]
  type CDataHandler = js.Function1[/* cdata */ java.lang.String, scala.Unit]
  type CloseTagHandler[O] = js.Function1[/* tag */ typings.saxes.mod.TagForOptions[O], scala.Unit]
  type CommentHandler = js.Function1[/* comment */ java.lang.String, scala.Unit]
  type DoctypeHandler = js.Function1[/* doctype */ java.lang.String, scala.Unit]
  type EndHandler = js.Function0[scala.Unit]
  type ErrorHandler = js.Function1[/* err */ typings.std.Error, scala.Unit]
  type EventNameToHandler[O, N /* <: typings.saxes.mod.EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: saxes.AnonAttribute<O>[N] */ js.Any
  type OpenTagHandler[O] = js.Function1[/* tag */ typings.saxes.mod.TagForOptions[O], scala.Unit]
  type OpenTagStartHandler[O] = js.Function1[/* tag */ typings.saxes.mod.StartTagForOptions[O], scala.Unit]
  type PIHandler = js.Function1[/* data */ typings.saxes.AnonBody, scala.Unit]
  type ReadyHandler = js.Function0[scala.Unit]
  type ResolvePrefix = js.Function1[/* prefix */ java.lang.String, js.UndefOr[java.lang.String]]
  type SaxesOptions = typings.saxes.mod.CommonOptions with typings.saxes.mod.NSOptions with typings.saxes.mod.XMLVersionOptions
  type TextHandler = js.Function1[/* text */ java.lang.String, scala.Unit]
  type XMLDeclHandler = js.Function1[/* decl */ typings.saxes.mod.XMLDecl, scala.Unit]
}
