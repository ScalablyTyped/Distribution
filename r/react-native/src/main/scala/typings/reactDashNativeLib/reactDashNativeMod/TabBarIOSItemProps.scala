package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabBarIOSItemProps extends ViewProps {
  /**
       * Little red bubble that sits at the top right of the icon.
       */
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
       * Background color for the badge. Available since iOS 10.
       */
  var badgeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A custom icon for the tab. It is ignored when a system icon is defined.
       */
  var icon: js.UndefOr[ImageURISource] = js.undefined
  /**
       * Callback when this tab is being selected,
       * you should change the state of your component to set selected={true}.
       */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If set to true it renders the image as original,
       * it defaults to being displayed as a template
       */
  var renderAsOriginal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * It specifies whether the children are visible or not. If you see a blank content, you probably forgot to add a selected one.
       */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A custom icon when the tab is selected.
       * It is ignored when a system icon is defined. If left empty, the icon will be tinted in blue.
       */
  var selectedIcon: js.UndefOr[ImageURISource] = js.undefined
  /**
       * Items comes with a few predefined system icons.
       * Note that if you are using them, the title and selectedIcon will be overriden with the system ones.
       *
       *  enum('bookmarks', 'contacts', 'downloads', 'favorites', 'featured', 'history', 'more', 'most-recent', 'most-viewed', 'recents', 'search', 'top-rated')
       */
  var systemIcon: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.bookmarks | reactDashNativeLib.reactDashNativeLibStrings.contacts | reactDashNativeLib.reactDashNativeLibStrings.downloads | reactDashNativeLib.reactDashNativeLibStrings.favorites | reactDashNativeLib.reactDashNativeLibStrings.featured | reactDashNativeLib.reactDashNativeLibStrings.history | reactDashNativeLib.reactDashNativeLibStrings.more | reactDashNativeLib.reactDashNativeLibStrings.`most-recent` | reactDashNativeLib.reactDashNativeLibStrings.`most-viewed` | reactDashNativeLib.reactDashNativeLibStrings.recents | reactDashNativeLib.reactDashNativeLibStrings.search | reactDashNativeLib.reactDashNativeLibStrings.`top-rated`
  ] = js.undefined
  /**
       * Text that appears under the icon. It is ignored when a system icon is defined.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

