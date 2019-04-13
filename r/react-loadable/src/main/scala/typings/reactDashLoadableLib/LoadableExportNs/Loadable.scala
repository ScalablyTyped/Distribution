package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loadable extends js.Object {
  var Capture: reactLib.reactMod.ComponentType[LoadableCaptureProps] = js.native
  def apply[Props, Exports /* <: js.Object */](options: Options[Props, Exports]): reactLib.reactMod.ComponentType[Props] with LoadableComponent = js.native
  def Map[Props, Exports /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](options: OptionsWithMap[Props, Exports]): reactLib.reactMod.ComponentType[Props] with LoadableComponent = js.native
  /**
    * This will call all of the LoadableComponent.preload methods recursively until they are all
    * resolved. Allowing you to preload all of your dynamic modules in environments like the server.
    * ```ts
    * Loadable.preloadAll().then(() => {
    *   app.listen(3000, () => {
    *     console.log('Running on http://localhost:3000/');
    *   });
    * });
    * ```
    */
  def preloadAll(): js.Promise[scala.Unit] = js.native
  /**
    * Check for modules that are already loaded in the browser and call the matching
    * `LoadableComponent.preload` methods.
    * ```ts
    * window.main = () => {
    *   Loadable.preloadReady().then(() => {
    *     ReactDOM.hydrate(
    *       <App/>,
    *       document.getElementById('app'),
    *     );
    *   });
    * };
    * ```
    */
  def preloadReady(): js.Promise[scala.Unit] = js.native
}

