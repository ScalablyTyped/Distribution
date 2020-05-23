package typings.reactRelay.entryPointTypesMod

import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRelay.reactRelayStrings.entryPoints
import typings.reactRelay.reactRelayStrings.extraProps
import typings.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>,   extraProps  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>, getComponent (): TEntryPointComponent,   queries  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>}> */
trait PreloadedEntryPoint[TEntryPointComponent] extends js.Object {
  val entryPoints: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.entryPoints]
  val extraProps: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.extraProps]
  val getComponent: js.Function0[TEntryPointComponent]
  val queries: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.queries]
}

object PreloadedEntryPoint {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): PreloadedEntryPoint[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedEntryPoint[TEntryPointComponent]]
  }
}

