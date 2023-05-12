package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
/* Rewritten from type alias, can be one of: 
  - typings.prosemirrorTables.anon.Colwidth
  - typings.prosemirrorTables.anon.N
  - typings.prosemirrorTables.anon.Row
  - typings.prosemirrorTables.anon.Pos
*/
trait Problem extends StObject
object Problem {
  
  inline def Colwidth(colwidth: ColWidths, pos: Double): typings.prosemirrorTables.anon.Colwidth = {
    val __obj = js.Dynamic.literal(colwidth = colwidth.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("colwidth mismatch")
    __obj.asInstanceOf[typings.prosemirrorTables.anon.Colwidth]
  }
  
  inline def N(n: Double, pos: Double, row: Double): typings.prosemirrorTables.anon.N = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collision")
    __obj.asInstanceOf[typings.prosemirrorTables.anon.N]
  }
  
  inline def Pos(n: Double, pos: Double): typings.prosemirrorTables.anon.Pos = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("overlong_rowspan")
    __obj.asInstanceOf[typings.prosemirrorTables.anon.Pos]
  }
  
  inline def Row(n: Double, row: Double): typings.prosemirrorTables.anon.Row = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("missing")
    __obj.asInstanceOf[typings.prosemirrorTables.anon.Row]
  }
}
