package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericHyperCubeLayout width extend GenericObjectLayout
  */
@js.native
trait IGenericHyperCubeLayout extends IGenericObjectLayout {
  
  var qHyperCube: IHyperCube = js.native
}
object IGenericHyperCubeLayout {
  
  @scala.inline
  def apply(
    qExtendsId: String,
    qHasSoftPatches: Boolean,
    qHyperCube: IHyperCube,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qStateName: String
  ): IGenericHyperCubeLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeLayout]
  }
  
  @scala.inline
  implicit class IGenericHyperCubeLayoutMutableBuilder[Self <: IGenericHyperCubeLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHyperCube(value: IHyperCube): Self = StObject.set(x, "qHyperCube", value.asInstanceOf[js.Any])
  }
}
