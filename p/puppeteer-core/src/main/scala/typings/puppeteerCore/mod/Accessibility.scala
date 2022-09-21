package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Accessibility")
@js.native
open class Accessibility () extends StObject {
  
  /* private */ var collectInterestingNodes: Any = js.native
  
  /* private */ var `private`: Any = js.native
  
  /* private */ var serializeTree: Any = js.native
  
  /* Excluded from this release type: __constructor */
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
    *
    * ```ts
    * const snapshot = await page.accessibility.snapshot();
    * console.log(snapshot);
    * ```
    *
    * @example
    * An example of logging the focused node's name:
    *
    * ```ts
    * const snapshot = await page.accessibility.snapshot();
    * const node = findFocusedNode(snapshot);
    * console.log(node && node.name);
    *
    * function findFocusedNode(node) {
    *   if (node.focused) return node;
    *   for (const child of node.children || []) {
    *     const foundNode = findFocusedNode(child);
    *     return foundNode;
    *   }
    *   return null;
    * }
    * ```
    *
    * @returns An AXNode object representing the snapshot.
    */
  def snapshot(): js.Promise[SerializedAXNode | Null] = js.native
  def snapshot(options: SnapshotOptions): js.Promise[SerializedAXNode | Null] = js.native
}
