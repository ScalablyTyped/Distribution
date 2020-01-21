package typings.reactRelay

import typings.react.mod._Global_.JSX.LibraryManagedAttributes
import typings.reactRelay.reactRelayStrings.entryPoints
import typings.reactRelay.reactRelayStrings.extraProps
import typings.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointsExtraPropsGetComponent[TEntryPointComponent] extends js.Object {
  var entryPoints: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.entryPoints]
  var extraProps: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.extraProps]
  var queries: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.queries]
  def getComponent(): TEntryPointComponent
}

object AnonEntryPointsExtraPropsGetComponent {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): AnonEntryPointsExtraPropsGetComponent[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntryPointsExtraPropsGetComponent[TEntryPointComponent]]
  }
}

