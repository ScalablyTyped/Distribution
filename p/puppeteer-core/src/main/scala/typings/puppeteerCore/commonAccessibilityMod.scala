package typings.puppeteerCore

import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonJshandleMod.ElementHandle
import typings.puppeteerCore.puppeteerCoreStrings.mixed
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonAccessibilityMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Accessibility", "Accessibility")
  @js.native
  class Accessibility protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession) = this()
    
    /* private */ var _client: js.Any = js.native
    
    /* private */ var collectInterestingNodes: js.Any = js.native
    
    /* private */ var serializeTree: js.Any = js.native
    
    /**
      * Captures the current state of the accessibility tree.
      * The returned object represents the root accessible node of the page.
      *
      * @remarks
      *
      * **NOTE** The Chromium accessibility tree contains nodes that go unused on
      * most platforms and by most screen readers. Puppeteer will discard them as
      * well for an easier to process tree, unless `interestingOnly` is set to
      * `false`.
      *
      * @example
      * An example of dumping the entire accessibility tree:
      * ```js
      * const snapshot = await page.accessibility.snapshot();
      * console.log(snapshot);
      * ```
      *
      * @example
      * An example of logging the focused node's name:
      * ```js
      * const snapshot = await page.accessibility.snapshot();
      * const node = findFocusedNode(snapshot);
      * console.log(node && node.name);
      *
      * function findFocusedNode(node) {
      *   if (node.focused)
      *     return node;
      *   for (const child of node.children || []) {
      *     const foundNode = findFocusedNode(child);
      *     return foundNode;
      *   }
      *   return null;
      * }
      * ```
      *
      * @returns An AXNode object representing the snapshot.
      *
      */
    def snapshot(): js.Promise[SerializedAXNode] = js.native
    def snapshot(options: SnapshotOptions): js.Promise[SerializedAXNode] = js.native
  }
  
  trait SerializedAXNode extends StObject {
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the checkbox is checked, or in a
      * {@link https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html | mixed state}.
      */
    var checked: js.UndefOr[Boolean | mixed] = js.undefined
    
    /**
      * Children of this node, if there are any.
      */
    var children: js.UndefOr[js.Array[SerializedAXNode]] = js.undefined
    
    /**
      * An additional human readable description of the node.
      */
    var description: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var haspopup: js.UndefOr[String] = js.undefined
    
    /**
      * Whether and in what way this node's value is invalid.
      */
    var invalid: js.UndefOr[String] = js.undefined
    
    /**
      * Any keyboard shortcuts associated with this node.
      */
    var keyshortcuts: js.UndefOr[String] = js.undefined
    
    /**
      * The level of a heading.
      */
    var level: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether more than one child can be selected.
      */
    var multiselectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A human readable name for the node.
      */
    var name: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the node is checked or in a mixed state.
      */
    var pressed: js.UndefOr[Boolean | mixed] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The {@link https://www.w3.org/TR/wai-aria/#usage_intro | role} of the node.
      */
    var role: String
    
    /**
      * A human readable alternative to the role.
      */
    var roledescription: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current value of the node.
      */
    var value: js.UndefOr[String | Double] = js.undefined
    
    var valuemax: js.UndefOr[Double] = js.undefined
    
    var valuemin: js.UndefOr[Double] = js.undefined
    
    /**
      * A description of the current value.
      */
    var valuetext: js.UndefOr[String] = js.undefined
  }
  object SerializedAXNode {
    
    inline def apply(role: String): SerializedAXNode = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedAXNode]
    }
    
    extension [Self <: SerializedAXNode](x: Self) {
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setChecked(value: Boolean | mixed): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: js.Array[SerializedAXNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: SerializedAXNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHaspopup(value: String): Self = StObject.set(x, "haspopup", value.asInstanceOf[js.Any])
      
      inline def setHaspopupUndefined: Self = StObject.set(x, "haspopup", js.undefined)
      
      inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setKeyshortcuts(value: String): Self = StObject.set(x, "keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def setKeyshortcutsUndefined: Self = StObject.set(x, "keyshortcuts", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setMultiselectable(value: Boolean): Self = StObject.set(x, "multiselectable", value.asInstanceOf[js.Any])
      
      inline def setMultiselectableUndefined: Self = StObject.set(x, "multiselectable", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPressed(value: Boolean | mixed): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoledescription(value: String): Self = StObject.set(x, "roledescription", value.asInstanceOf[js.Any])
      
      inline def setRoledescriptionUndefined: Self = StObject.set(x, "roledescription", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValuemax(value: Double): Self = StObject.set(x, "valuemax", value.asInstanceOf[js.Any])
      
      inline def setValuemaxUndefined: Self = StObject.set(x, "valuemax", js.undefined)
      
      inline def setValuemin(value: Double): Self = StObject.set(x, "valuemin", value.asInstanceOf[js.Any])
      
      inline def setValueminUndefined: Self = StObject.set(x, "valuemin", js.undefined)
      
      inline def setValuetext(value: String): Self = StObject.set(x, "valuetext", value.asInstanceOf[js.Any])
      
      inline def setValuetextUndefined: Self = StObject.set(x, "valuetext", js.undefined)
    }
  }
  
  trait SnapshotOptions extends StObject {
    
    /**
      * Prune uninteresting nodes from the tree.
      * @defaultValue true
      */
    var interestingOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Root node to get the accessibility tree for
      * @defaultValue The root node of the entire page.
      */
    var root: js.UndefOr[ElementHandle[Element]] = js.undefined
  }
  object SnapshotOptions {
    
    inline def apply(): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotOptions]
    }
    
    extension [Self <: SnapshotOptions](x: Self) {
      
      inline def setInterestingOnly(value: Boolean): Self = StObject.set(x, "interestingOnly", value.asInstanceOf[js.Any])
      
      inline def setInterestingOnlyUndefined: Self = StObject.set(x, "interestingOnly", js.undefined)
      
      inline def setRoot(value: ElementHandle[Element]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
