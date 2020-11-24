package typings.strange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strange", JSImport.Namespace)
@js.native
/**
  *
  * @param begin Range's beginning, or left endpoint.
  * @param end Range's end, or right endpoint.
  * @param bounds Range's bounds.
  */
class Class[T /* <: Endpoint */] ()
  extends typings.std.Range {
  def this(begin: T) = this()
  def this(begin: T, end: T) = this()
  def this(begin: js.UndefOr[scala.Nothing], end: T) = this()
  def this(begin: Null, end: T) = this()
  def this(begin: T, end: T, bounds: Bounds) = this()
  def this(begin: T, end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
  def this(begin: T, end: Null, bounds: Bounds) = this()
  def this(begin: js.UndefOr[scala.Nothing], end: T, bounds: Bounds) = this()
  def this(begin: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
  def this(begin: js.UndefOr[scala.Nothing], end: Null, bounds: Bounds) = this()
  def this(begin: Null, end: T, bounds: Bounds) = this()
  def this(begin: Null, end: js.UndefOr[scala.Nothing], bounds: Bounds) = this()
  def this(begin: Null, end: Null, bounds: Bounds) = this()
}
