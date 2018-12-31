package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlWriter
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.writerNs.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of defaultDocumentRoot
  		* @returns String
  		*/
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of documentRoot
  		* @returns String
  		*/
  var getDocumentRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns String
  		*/
  var getHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of defaultDocumentRoot
  		* @param defaultDocumentRoot String The new value.
  		*/
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of documentRoot
  		* @param documentRoot String The new value.
  		*/
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header String The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method]
  		* @param request Object
  		* @param data Array
  		* @returns Object
  		*/
  var writeRecords: js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
}

