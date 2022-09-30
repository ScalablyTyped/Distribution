package typings.storybookCoreClient

import typings.std.Map
import typings.std.Record
import typings.storybookCoreClient.anon.Added
import typings.storybookCoreClient.typesMod.Loadable
import typings.webpackEnv.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executeLoadableMod {
  
  @JSImport("@storybook/core-client/dist/ts3.9/preview/executeLoadable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeLoadable(loadable: Loadable): Map[String, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeLoadable")(loadable.asInstanceOf[js.Any]).asInstanceOf[Map[String, Record[String, Any]]]
  
  inline def executeLoadableForChanges(loadable: Loadable): Added = ^.asInstanceOf[js.Dynamic].applyDynamic("executeLoadableForChanges")(loadable.asInstanceOf[js.Any]).asInstanceOf[Added]
  inline def executeLoadableForChanges(loadable: Loadable, m: NodeModule): Added = (^.asInstanceOf[js.Dynamic].applyDynamic("executeLoadableForChanges")(loadable.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Added]
}
