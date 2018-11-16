package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowMetadata[T] extends js.Object {
  /**
  		 * Metadata related to individual columns
  		 */
  var columns: /* import warning: Failed type conversion: TsTypeObject(List(TsMemberIndex(Comments(1),false,Default,IndexingDict(TsIdentSimple(index),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(slickgrid), TsIdentNamespace(Slick), TsIdentSimple(ColumnMetadata))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))), TsMemberIndex(Comments(1),false,Default,IndexingDict(TsIdentSimple(index),TsTypeRef(TsQIdent(List(TsIdentSimple(number))),List())),false,TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(slickgrid), TsIdentNamespace(Slick), TsIdentSimple(ColumnMetadata))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))))) */js.UndefOr[
    /* import warning: Failed type conversion: TsTypeObject(List(TsMemberIndex(Comments(1),false,Default,IndexingDict(TsIdentSimple(index),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(slickgrid), TsIdentNamespace(Slick), TsIdentSimple(ColumnMetadata))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))), TsMemberIndex(Comments(1),false,Default,IndexingDict(TsIdentSimple(index),TsTypeRef(TsQIdent(List(TsIdentSimple(number))),List())),false,TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(slickgrid), TsIdentNamespace(Slick), TsIdentSimple(ColumnMetadata))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))))) */js.Any
  ] = js.undefined
  /**
  		 * One or more (space-separated) CSS classes to be added to the entire row.
  		 */
  var cssClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether or not any cells in the row can be set as "active".
  		 */
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Whether or not a row or any cells in it can be selected.
  		 */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
}

