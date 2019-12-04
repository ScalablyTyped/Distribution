package typings.reactDashRelay

import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
import typings.reactDashRelay.reactDashRelayStrings.entryPoints
import typings.reactDashRelay.reactDashRelayStrings.extraProps
import typings.reactDashRelay.reactDashRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointsExtraPropsGetComponent[TEntryPointComponent] extends js.Object {
  var entryPoints: LibraryManagedAttributes[TEntryPointComponent, typings.reactDashRelay.reactDashRelayStrings.entryPoints]
  var extraProps: LibraryManagedAttributes[TEntryPointComponent, typings.reactDashRelay.reactDashRelayStrings.extraProps]
  var queries: LibraryManagedAttributes[TEntryPointComponent, typings.reactDashRelay.reactDashRelayStrings.queries]
  def getComponent(): TEntryPointComponent
}

object Anon_EntryPointsExtraPropsGetComponent {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): Anon_EntryPointsExtraPropsGetComponent[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EntryPointsExtraPropsGetComponent[TEntryPointComponent]]
  }
}

