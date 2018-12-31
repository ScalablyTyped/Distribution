package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplate extends IBase {
  /** [Method] Applies the supplied values to the template and appends the new node s to the specified el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns an HTML fragment of this template with the specified values applied
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object/Array The template values. See apply.
  		* @param out Array The array to which output is pushed.
  		* @returns Array The given out array.
  		*/
  var applyOut: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Alias for apply
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  var applyTemplate: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Compiles the template into an internal function eliminating the RegEx overhead
  		* @returns Ext.Template this
  		*/
  var compile: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var compiled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s after el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s before el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and overwrites the content of el with the new node s
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the HTML used as the template and optionally compiles it
  		* @param html String
  		* @param compile Boolean true to compile the template.
  		* @returns Ext.Template this
  		*/
  var set: js.UndefOr[
    js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
}

