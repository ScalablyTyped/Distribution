package typings.std.global

import typings.std.QueuingStrategy
import typings.std.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TransformStream")
@js.native
/* standard dom */
open class TransformStream[I, O] ()
  extends StObject
     with typings.std.TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val readable: typings.std.ReadableStream[O] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val writable: typings.std.WritableStream[I] = js.native
}
