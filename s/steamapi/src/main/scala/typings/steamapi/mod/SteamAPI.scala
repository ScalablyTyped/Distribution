package typings.steamapi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SteamAPI extends StObject {
  
  /**
    * Get custom path that isn't in SteamAPI.
    * @param path Path to request e.g '/IPlayerService/GetOwnedGames/v1?steamid=76561198378422474'
    * @param [base=this.baseAPI] Base URL
    * @param [key=this.key] The key to use
    * @returns JSON Response
    */
  def get(path: String): Record[String, Any] = js.native
  def get(path: String, base: String): Record[String, Any] = js.native
  def get(path: String, base: String, key: String): Record[String, Any] = js.native
  def get(path: String, base: Unit, key: String): Record[String, Any] = js.native
  
  /**
    * Get every single app on steam.
    * @returns Array of apps
    */
  def getAppList(): js.Promise[js.Array[App]] = js.native
  
  /**
    * Get featured categories on the steam store.
    * @returns Featured categories
    */
  def getFeaturedCategories(): js.Promise[js.Array[Record[String, Any]]] = js.native
  
  /**
    * Get featured games on the steam store
    * @returns Featured games
    */
  def getFeaturedGames(): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Get achievements for app id.
    * @param app App ID
    * @returns App achievements for ID
    */
  def getGameAchievements(app: String): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Get details for app id.
    * <warn>Requests for this endpoint are limited to 200 every 5 minutes</warn>
    * @param app App ID
    * @param [force=false] Overwrite cache
    * @param [region=us] Store region
    * @returns App details for ID
    */
  def getGameDetails(app: String): js.Promise[Record[String, Any]] = js.native
  def getGameDetails(app: String, force: Boolean): js.Promise[Record[String, Any]] = js.native
  def getGameDetails(app: String, force: Boolean, region: String): js.Promise[Record[String, Any]] = js.native
  def getGameDetails(app: String, force: Unit, region: String): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Get news for app id.
    * @param app App ID
    * @returns App news for ID
    */
  def getGameNews(app: String): js.Promise[js.Array[Record[String, Any]]] = js.native
  
  /**
    * Get number of current players for app id.
    * @param app App ID
    * @returns Number of players
    */
  def getGamePlayers(app: String): js.Promise[Double] = js.native
  
  /**
    * Get schema for app id.
    * @param app App ID
    * @returns Schema
    */
  def getGameSchema(app: String): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Get every server associated with host.
    * @param host Host to request
    * @returns Server info
    */
  def getServers(host: String): js.Promise[js.Array[Server]] = js.native
  
  /**
    * Get users achievements for app id.
    * @param id User ID
    * @param app App ID
    * @returns Achievements
    */
  def getUserAchievements(id: String, app: String): js.Promise[PlayerAchievements] = js.native
  
  /**
    * Get users badges.
    * @param id User ID
    * @returns Badges
    */
  def getUserBadges(id: String): js.Promise[PlayerBadges] = js.native
  
  /**
    * Get users bans.
    * @param id User ID
    * @returns Ban info
    */
  def getUserBans(id: String): js.Promise[PlayerBans] = js.native
  /**
    * Get users bans.
    * @param id User IDs
    * @returns Ban info
    */
  def getUserBans(id: js.Array[String]): js.Promise[js.Array[PlayerBans]] = js.native
  
  /**
    * Get users friends.
    * @param id User ID
    * @returns Friends
    */
  def getUserFriends(id: String): js.Promise[js.Array[Friend]] = js.native
  
  /**
    * Get users groups.
    * @param id User ID
    * @returns Groups
    */
  def getUserGroups(id: String): js.Promise[js.Array[String]] = js.native
  
  /**
    * Get users level.
    * @param id User ID
    * @returns Level
    */
  def getUserLevel(id: String): js.Promise[Double] = js.native
  
  /**
    * Get users owned games.
    * @param id User ID
    * @returns Owned games
    */
  def getUserOwnedGames(id: String): js.Promise[js.Array[Game]] = js.native
  
  /**
    * Get users recent games.
    * @param id User ID
    * @returns Recent games
    */
  def getUserRecentGames(id: String): js.Promise[js.Array[RecentGame]] = js.native
  
  /**
    * Gets servers on steamcommunity.com/dev/managegameservers using your key or provided key.
    * @param [hide=false] Hide deleted/expired servers
    * @param [key=this.key] Key
    * @returns Servers
    */
  def getUserServers(): js.Promise[PlayerServers] = js.native
  def getUserServers(hide: Boolean): js.Promise[PlayerServers] = js.native
  def getUserServers(hide: Boolean, key: String): js.Promise[PlayerServers] = js.native
  def getUserServers(hide: Unit, key: String): js.Promise[PlayerServers] = js.native
  
  /**
    * Get users stats for app id.
    * @param id User ID
    * @param app App ID
    * @returns Stats for app id
    */
  def getUserStats(id: String, app: String): js.Promise[PlayerStats] = js.native
  
  /**
    * Get users summary.
    * @param id User IDs
    * @returns Summary
    */
  def getUserSummary(id: String): js.Promise[PlayerSummary] = js.native
  /**
    * Get users summary.
    * @param id User IDs
    * @returns Summary
    */
  def getUserSummary(id: js.Array[String]): js.Promise[js.Array[PlayerSummary]] = js.native
  
  /**
    * Resolve info based on id, profile, or url.
    * Rejects promise if a profile couldn't be resolved.
    * @param info Something to resolve e.g 'https://steamcommunity.com/id/xDim'
    * @returns Profile ID
    */
  def resolve(info: String): js.Promise[String] = js.native
}
