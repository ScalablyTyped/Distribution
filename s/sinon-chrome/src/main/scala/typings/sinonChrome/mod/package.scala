package typings.sinonChrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def csi: typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any] = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].selectDynamic("csi").asInstanceOf[typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any]]
  @scala.inline
  def csi_=(x: typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any]): scala.Unit = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].updateDynamic("csi")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def flush(): scala.Unit = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def loadTimes: typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any] = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].selectDynamic("loadTimes").asInstanceOf[typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any]]
  @scala.inline
  def loadTimes_=(x: typings.sinon.mod.SinonSpy[js.Array[js.Any], js.Any]): scala.Unit = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].updateDynamic("loadTimes")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def registerPlugin(plugin: js.Object): scala.Unit = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def reset(): scala.Unit = typings.sinonChrome.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[scala.Unit]
}
