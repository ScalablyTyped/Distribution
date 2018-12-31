package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProxy
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
  		* @param options Object Object containing one or more properties supported by the batch method:
  		* @returns Ext.data.Batch The newly created Batch
  		*/
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.undefined
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs the given create operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var create: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Performs the given destroy operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  @JSName("destroy")
  var destroy_IDataProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of batchActions
  		* @returns Boolean
  		*/
  var getBatchActions: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of batchOrder
  		* @returns String
  		*/
  var getBatchOrder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns String/Ext.data.Model
  		*/
  var getModel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of reader
  		* @returns Object/String/Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of writer
  		* @returns Object/String/Ext.data.writer.Writer
  		*/
  var getWriter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[js.Any] = js.undefined
  /** [Method] Performs the given read operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var read: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of batchActions
  		* @param batchActions Boolean The new value.
  		*/
  var setBatchActions: js.UndefOr[js.Function1[/* batchActions */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of batchOrder
  		* @param batchOrder String The new value.
  		*/
  var setBatchOrder: js.UndefOr[js.Function1[/* batchOrder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model String/Ext.data.Model The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of reader
  		* @param reader Object/String/Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of writer
  		* @param writer Object/String/Ext.data.writer.Writer The new value.
  		*/
  var setWriter: js.UndefOr[js.Function1[/* writer */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Performs the given update operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var update: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.undefined
}

