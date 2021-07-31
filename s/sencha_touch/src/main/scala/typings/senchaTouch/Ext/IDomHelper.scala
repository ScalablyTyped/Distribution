package typings.senchaTouch.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDomHelper extends StObject {
  
  /** [Method] Creates new DOM element s and appends them to el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Applies a style specification to an element
    * @param el String/HTMLElement The element to apply styles to
    * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
    */
  var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Creates a new Ext Template from the DOM object spec
    * @param o Object The DOM object spec (and children)
    * @returns Ext.Template The new template
    */
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.undefined
  
  /** [Method] Converts the styles from the given object to text
    * @param styles Object The object describing the styles.
    * @param buffer String[] The output buffer.
    * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
    */
  var generateStyles: js.UndefOr[
    js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array], js.Any]
  ] = js.undefined
  
  /** [Method] Creates new DOM element s and inserts them after el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object The DOM object spec (and children)
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Creates new DOM element s and inserts them before el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Creates new DOM element s and inserts them as the first child of el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Inserts an HTML fragment into the DOM
    * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
    * @param el HTMLElement/TextNode The context element
    * @param html String The HTML fragment
    * @returns HTMLElement The new node
    */
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[java.lang.String], 
      /* el */ js.UndefOr[js.Any], 
      /* html */ js.UndefOr[java.lang.String], 
      HTMLElement
    ]
  ] = js.undefined
  
  /** [Method] Returns the markup for the passed Element s config
    * @param spec Object The DOM object spec (and children).
    * @returns String
    */
  var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  
  /** [Method] Creates new DOM element s and overwrites the contents of el with them
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
}
object IDomHelper {
  
  @scala.inline
  def apply(): IDomHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDomHelper]
  }
  
  @scala.inline
  implicit class IDomHelperMutableBuilder[Self <: IDomHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "append", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setApplyStyles(value: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "applyStyles", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
    
    @scala.inline
    def setCreateTemplate(value: /* o */ js.UndefOr[js.Any] => ITemplate): Self = StObject.set(x, "createTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTemplateUndefined: Self = StObject.set(x, "createTemplate", js.undefined)
    
    @scala.inline
    def setGenerateStyles(value: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => js.Any): Self = StObject.set(x, "generateStyles", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGenerateStylesUndefined: Self = StObject.set(x, "generateStyles", js.undefined)
    
    @scala.inline
    def setInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    @scala.inline
    def setInsertBefore(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    @scala.inline
    def setInsertFirst(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertFirst", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    @scala.inline
    def setInsertHtml(
      value: (/* where */ js.UndefOr[java.lang.String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[java.lang.String]) => HTMLElement
    ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
    
    @scala.inline
    def setMarkup(value: /* spec */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "markup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
    
    @scala.inline
    def setOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "overwrite", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
