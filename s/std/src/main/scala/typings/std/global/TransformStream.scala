package typings.std.global

import typings.std.QueuingStrategy
import typings.std.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TransformStream")
@js.native
class TransformStream[I, O] ()
  extends typings.std.TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: js.UndefOr[scala.Nothing], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(
    transformer: js.UndefOr[scala.Nothing],
    writableStrategy: js.UndefOr[scala.Nothing],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: js.UndefOr[scala.Nothing],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: js.UndefOr[scala.Nothing],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
}
