package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClientComponentNameLocation extends js.Object {
  @JSName("client")
  var client_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  @JSName("operations")
  var operations_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  @JSName("renderPromises")
  var renderPromises_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  def client(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def operations(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def renderPromises(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

