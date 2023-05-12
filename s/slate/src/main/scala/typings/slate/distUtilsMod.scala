package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPathRefMod.PathRef
import typings.slate.distInterfacesPointRefMod.PointRef
import typings.slate.distInterfacesRangeRefMod.RangeRef
import typings.std.Generator
import typings.std.Record
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("slate/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate/dist/utils", "DIRTY_PATHS")
  @js.native
  val DIRTY_PATHS: WeakMap[Editor, js.Array[Path]] = js.native
  
  @JSImport("slate/dist/utils", "DIRTY_PATH_KEYS")
  @js.native
  val DIRTY_PATH_KEYS: WeakMap[Editor, Set[String]] = js.native
  
  @JSImport("slate/dist/utils", "FLUSHING")
  @js.native
  val FLUSHING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate/dist/utils", "NORMALIZING")
  @js.native
  val NORMALIZING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate/dist/utils", "PATH_REFS")
  @js.native
  val PATH_REFS: WeakMap[Editor, Set[PathRef]] = js.native
  
  @JSImport("slate/dist/utils", "POINT_REFS")
  @js.native
  val POINT_REFS: WeakMap[Editor, Set[PointRef]] = js.native
  
  @JSImport("slate/dist/utils", "RANGE_REFS")
  @js.native
  val RANGE_REFS: WeakMap[Editor, Set[RangeRef]] = js.native
  
  inline def codepointsIteratorRTL(str: String): Generator[String, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("codepointsIteratorRTL")(str.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Any]]
  
  inline def getCharacterDistance(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCharacterDistance")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCharacterDistance(str: String, isRTL: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharacterDistance")(str.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDefaultInsertLocation(editor: Editor): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultInsertLocation")(editor.asInstanceOf[js.Any]).asInstanceOf[Location]
  
  inline def getWordDistance(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWordDistance")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWordDistance(text: String, isRTL: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWordDistance")(text.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isDeepEqual(node: Record[String, Any], another: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqual")(node.asInstanceOf[js.Any], another.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchPath(editor: Editor, path: Path): js.Function1[/* node */ Node, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(editor.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ Node, Boolean]]
  
  inline def splitByCharacterDistance(str: String, dist: Double): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitByCharacterDistance")(str.asInstanceOf[js.Any], dist.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  inline def splitByCharacterDistance(str: String, dist: Double, isRTL: Boolean): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitByCharacterDistance")(str.asInstanceOf[js.Any], dist.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
}
