package typings.regeneratorRuntime.mod

import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regenerator-runtime", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.UndefOr[scala.Nothing],
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
  def apply[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: js.UndefOr[scala.Nothing],
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = js.native
}
