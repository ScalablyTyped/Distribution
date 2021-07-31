package typings.reduxPersistTransformFilter

import typings.reduxPersist.typesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-transform-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[State, Raw](reducerName: String): Transform[State, Raw, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
  @scala.inline
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
  @scala.inline
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
  @scala.inline
  def default[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: js.Array[String]): Transform[State, Raw, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
}
