package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * game-v1.3
  */
object Game {
  
  @js.native
  trait GameDto extends StObject {
    
    var championId: Double = js.native
    
    var createDate: Double = js.native
    
    var fellowPlayers: js.Array[PlayerDto] = js.native
    
    var gameId: Double = js.native
    
    var gameMode: String = js.native
    
    var gameType: String = js.native
    
    var invalid: Boolean = js.native
    
    var ipEarned: Double = js.native
    
    var level: Double = js.native
    
    var mapId: Double = js.native
    
    var spell1: Double = js.native
    
    var spell2: Double = js.native
    
    var stats: RawStatsDto = js.native
    
    var subType: String = js.native
    
    var teamId: Double = js.native
  }
  object GameDto {
    
    @scala.inline
    def apply(
      championId: Double,
      createDate: Double,
      fellowPlayers: js.Array[PlayerDto],
      gameId: Double,
      gameMode: String,
      gameType: String,
      invalid: Boolean,
      ipEarned: Double,
      level: Double,
      mapId: Double,
      spell1: Double,
      spell2: Double,
      stats: RawStatsDto,
      subType: String,
      teamId: Double
    ): GameDto = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], fellowPlayers = fellowPlayers.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ipEarned = ipEarned.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], spell1 = spell1.asInstanceOf[js.Any], spell2 = spell2.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GameDto]
    }
    
    @scala.inline
    implicit class GameDtoMutableBuilder[Self <: GameDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDate(value: Double): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFellowPlayers(value: js.Array[PlayerDto]): Self = StObject.set(x, "fellowPlayers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFellowPlayersVarargs(value: PlayerDto*): Self = StObject.set(x, "fellowPlayers", js.Array(value :_*))
      
      @scala.inline
      def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpEarned(value: Double): Self = StObject.set(x, "ipEarned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell1(value: Double): Self = StObject.set(x, "spell1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell2(value: Double): Self = StObject.set(x, "spell2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: RawStatsDto): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlayerDto extends StObject {
    
    var championId: Double = js.native
    
    var summonerId: Double = js.native
    
    var teamId: Double = js.native
  }
  object PlayerDto {
    
    @scala.inline
    def apply(championId: Double, summonerId: Double, teamId: Double): PlayerDto = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerDto]
    }
    
    @scala.inline
    implicit class PlayerDtoMutableBuilder[Self <: PlayerDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawStatsDto extends StObject {
    
    var assists: Double = js.native
    
    var barracksKilled: Double = js.native
    
    var championsKilled: Double = js.native
    
    var combatPlayerScore: Double = js.native
    
    var consumablesPurchased: Double = js.native
    
    var damageDealtPlayer: Double = js.native
    
    var doubleKills: Double = js.native
    
    var firstBlood: Double = js.native
    
    var gold: Double = js.native
    
    var goldEarned: Double = js.native
    
    var goldSpent: Double = js.native
    
    var item0: Double = js.native
    
    var item1: Double = js.native
    
    var item2: Double = js.native
    
    var item3: Double = js.native
    
    var item4: Double = js.native
    
    var item5: Double = js.native
    
    var item6: Double = js.native
    
    var itemsPurchased: Double = js.native
    
    var killingSprees: Double = js.native
    
    var largestCriticalStrike: Double = js.native
    
    var largestKillingSpree: Double = js.native
    
    var largestMultiKill: Double = js.native
    
    var legendaryItemsCreated: Double = js.native
    
    var level: Double = js.native
    
    var magicDamageDealtPlayer: Double = js.native
    
    var magicDamageDealtToChampions: Double = js.native
    
    var magicDamageTaken: Double = js.native
    
    var minionsDenied: Double = js.native
    
    var minionsKilled: Double = js.native
    
    var neutralMinionsKilled: Double = js.native
    
    var neutralMinionsKilledEnemyJungle: Double = js.native
    
    var neutralMinionsKilledYourJungle: Double = js.native
    
    var nexusKilled: Boolean = js.native
    
    var nodeCapture: Double = js.native
    
    var nodeCaptureAssist: Double = js.native
    
    var nodeNeutralize: Double = js.native
    
    var nodeNeutralizeAssist: Double = js.native
    
    var numDeaths: Double = js.native
    
    var numItemsBought: Double = js.native
    
    var objectivePlayerScore: Double = js.native
    
    var pentaKills: Double = js.native
    
    var physicalDamageDealtPlayer: Double = js.native
    
    var physicalDamageDealtToChampions: Double = js.native
    
    var physicalDamageTaken: Double = js.native
    
    var playerPosition: Double = js.native
    
    var playerRole: Double = js.native
    
    var quadraKills: Double = js.native
    
    var sightWardsBought: Double = js.native
    
    var spell1Cast: Double = js.native
    
    var spell2Cast: Double = js.native
    
    var spell3Cast: Double = js.native
    
    var spell4Cast: Double = js.native
    
    var summonSpell1Cast: Double = js.native
    
    var summonSpell2Cast: Double = js.native
    
    var superMonsterKilled: Double = js.native
    
    var team: Double = js.native
    
    var teamObjective: Double = js.native
    
    var timePlayed: Double = js.native
    
    var totalDamageDealt: Double = js.native
    
    var totalDamageDealtToChampions: Double = js.native
    
    var totalDamageTaker: Double = js.native
    
    var totalHeal: Double = js.native
    
    var totalPlayerScore: Double = js.native
    
    var totalScoreRank: Double = js.native
    
    var totalTimeCrowdControlDealt: Double = js.native
    
    var totalUnitsHealed: Double = js.native
    
    var tripleKills: Double = js.native
    
    var trueDamageDealtPlayer: Double = js.native
    
    var trueDamageDealtToChampions: Double = js.native
    
    var trueDamageTaken: Double = js.native
    
    var turrentsKilled: Double = js.native
    
    var unrealKills: Double = js.native
    
    var victoryPointTotal: Double = js.native
    
    var visionWardsBought: Double = js.native
    
    var wardKilled: Double = js.native
    
    var wardPlaced: Double = js.native
    
    var win: Boolean = js.native
  }
  object RawStatsDto {
    
    @scala.inline
    def apply(
      assists: Double,
      barracksKilled: Double,
      championsKilled: Double,
      combatPlayerScore: Double,
      consumablesPurchased: Double,
      damageDealtPlayer: Double,
      doubleKills: Double,
      firstBlood: Double,
      gold: Double,
      goldEarned: Double,
      goldSpent: Double,
      item0: Double,
      item1: Double,
      item2: Double,
      item3: Double,
      item4: Double,
      item5: Double,
      item6: Double,
      itemsPurchased: Double,
      killingSprees: Double,
      largestCriticalStrike: Double,
      largestKillingSpree: Double,
      largestMultiKill: Double,
      legendaryItemsCreated: Double,
      level: Double,
      magicDamageDealtPlayer: Double,
      magicDamageDealtToChampions: Double,
      magicDamageTaken: Double,
      minionsDenied: Double,
      minionsKilled: Double,
      neutralMinionsKilled: Double,
      neutralMinionsKilledEnemyJungle: Double,
      neutralMinionsKilledYourJungle: Double,
      nexusKilled: Boolean,
      nodeCapture: Double,
      nodeCaptureAssist: Double,
      nodeNeutralize: Double,
      nodeNeutralizeAssist: Double,
      numDeaths: Double,
      numItemsBought: Double,
      objectivePlayerScore: Double,
      pentaKills: Double,
      physicalDamageDealtPlayer: Double,
      physicalDamageDealtToChampions: Double,
      physicalDamageTaken: Double,
      playerPosition: Double,
      playerRole: Double,
      quadraKills: Double,
      sightWardsBought: Double,
      spell1Cast: Double,
      spell2Cast: Double,
      spell3Cast: Double,
      spell4Cast: Double,
      summonSpell1Cast: Double,
      summonSpell2Cast: Double,
      superMonsterKilled: Double,
      team: Double,
      teamObjective: Double,
      timePlayed: Double,
      totalDamageDealt: Double,
      totalDamageDealtToChampions: Double,
      totalDamageTaker: Double,
      totalHeal: Double,
      totalPlayerScore: Double,
      totalScoreRank: Double,
      totalTimeCrowdControlDealt: Double,
      totalUnitsHealed: Double,
      tripleKills: Double,
      trueDamageDealtPlayer: Double,
      trueDamageDealtToChampions: Double,
      trueDamageTaken: Double,
      turrentsKilled: Double,
      unrealKills: Double,
      victoryPointTotal: Double,
      visionWardsBought: Double,
      wardKilled: Double,
      wardPlaced: Double,
      win: Boolean
    ): RawStatsDto = {
      val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], barracksKilled = barracksKilled.asInstanceOf[js.Any], championsKilled = championsKilled.asInstanceOf[js.Any], combatPlayerScore = combatPlayerScore.asInstanceOf[js.Any], consumablesPurchased = consumablesPurchased.asInstanceOf[js.Any], damageDealtPlayer = damageDealtPlayer.asInstanceOf[js.Any], doubleKills = doubleKills.asInstanceOf[js.Any], firstBlood = firstBlood.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], goldEarned = goldEarned.asInstanceOf[js.Any], goldSpent = goldSpent.asInstanceOf[js.Any], item0 = item0.asInstanceOf[js.Any], item1 = item1.asInstanceOf[js.Any], item2 = item2.asInstanceOf[js.Any], item3 = item3.asInstanceOf[js.Any], item4 = item4.asInstanceOf[js.Any], item5 = item5.asInstanceOf[js.Any], item6 = item6.asInstanceOf[js.Any], itemsPurchased = itemsPurchased.asInstanceOf[js.Any], killingSprees = killingSprees.asInstanceOf[js.Any], largestCriticalStrike = largestCriticalStrike.asInstanceOf[js.Any], largestKillingSpree = largestKillingSpree.asInstanceOf[js.Any], largestMultiKill = largestMultiKill.asInstanceOf[js.Any], legendaryItemsCreated = legendaryItemsCreated.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], magicDamageDealtPlayer = magicDamageDealtPlayer.asInstanceOf[js.Any], magicDamageDealtToChampions = magicDamageDealtToChampions.asInstanceOf[js.Any], magicDamageTaken = magicDamageTaken.asInstanceOf[js.Any], minionsDenied = minionsDenied.asInstanceOf[js.Any], minionsKilled = minionsKilled.asInstanceOf[js.Any], neutralMinionsKilled = neutralMinionsKilled.asInstanceOf[js.Any], neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle.asInstanceOf[js.Any], neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle.asInstanceOf[js.Any], nexusKilled = nexusKilled.asInstanceOf[js.Any], nodeCapture = nodeCapture.asInstanceOf[js.Any], nodeCaptureAssist = nodeCaptureAssist.asInstanceOf[js.Any], nodeNeutralize = nodeNeutralize.asInstanceOf[js.Any], nodeNeutralizeAssist = nodeNeutralizeAssist.asInstanceOf[js.Any], numDeaths = numDeaths.asInstanceOf[js.Any], numItemsBought = numItemsBought.asInstanceOf[js.Any], objectivePlayerScore = objectivePlayerScore.asInstanceOf[js.Any], pentaKills = pentaKills.asInstanceOf[js.Any], physicalDamageDealtPlayer = physicalDamageDealtPlayer.asInstanceOf[js.Any], physicalDamageDealtToChampions = physicalDamageDealtToChampions.asInstanceOf[js.Any], physicalDamageTaken = physicalDamageTaken.asInstanceOf[js.Any], playerPosition = playerPosition.asInstanceOf[js.Any], playerRole = playerRole.asInstanceOf[js.Any], quadraKills = quadraKills.asInstanceOf[js.Any], sightWardsBought = sightWardsBought.asInstanceOf[js.Any], spell1Cast = spell1Cast.asInstanceOf[js.Any], spell2Cast = spell2Cast.asInstanceOf[js.Any], spell3Cast = spell3Cast.asInstanceOf[js.Any], spell4Cast = spell4Cast.asInstanceOf[js.Any], summonSpell1Cast = summonSpell1Cast.asInstanceOf[js.Any], summonSpell2Cast = summonSpell2Cast.asInstanceOf[js.Any], superMonsterKilled = superMonsterKilled.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], teamObjective = teamObjective.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any], totalDamageDealt = totalDamageDealt.asInstanceOf[js.Any], totalDamageDealtToChampions = totalDamageDealtToChampions.asInstanceOf[js.Any], totalDamageTaker = totalDamageTaker.asInstanceOf[js.Any], totalHeal = totalHeal.asInstanceOf[js.Any], totalPlayerScore = totalPlayerScore.asInstanceOf[js.Any], totalScoreRank = totalScoreRank.asInstanceOf[js.Any], totalTimeCrowdControlDealt = totalTimeCrowdControlDealt.asInstanceOf[js.Any], totalUnitsHealed = totalUnitsHealed.asInstanceOf[js.Any], tripleKills = tripleKills.asInstanceOf[js.Any], trueDamageDealtPlayer = trueDamageDealtPlayer.asInstanceOf[js.Any], trueDamageDealtToChampions = trueDamageDealtToChampions.asInstanceOf[js.Any], trueDamageTaken = trueDamageTaken.asInstanceOf[js.Any], turrentsKilled = turrentsKilled.asInstanceOf[js.Any], unrealKills = unrealKills.asInstanceOf[js.Any], victoryPointTotal = victoryPointTotal.asInstanceOf[js.Any], visionWardsBought = visionWardsBought.asInstanceOf[js.Any], wardKilled = wardKilled.asInstanceOf[js.Any], wardPlaced = wardPlaced.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawStatsDto]
    }
    
    @scala.inline
    implicit class RawStatsDtoMutableBuilder[Self <: RawStatsDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssists(value: Double): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarracksKilled(value: Double): Self = StObject.set(x, "barracksKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionsKilled(value: Double): Self = StObject.set(x, "championsKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombatPlayerScore(value: Double): Self = StObject.set(x, "combatPlayerScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumablesPurchased(value: Double): Self = StObject.set(x, "consumablesPurchased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDamageDealtPlayer(value: Double): Self = StObject.set(x, "damageDealtPlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleKills(value: Double): Self = StObject.set(x, "doubleKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstBlood(value: Double): Self = StObject.set(x, "firstBlood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGold(value: Double): Self = StObject.set(x, "gold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldEarned(value: Double): Self = StObject.set(x, "goldEarned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldSpent(value: Double): Self = StObject.set(x, "goldSpent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem0(value: Double): Self = StObject.set(x, "item0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem1(value: Double): Self = StObject.set(x, "item1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem2(value: Double): Self = StObject.set(x, "item2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem3(value: Double): Self = StObject.set(x, "item3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem4(value: Double): Self = StObject.set(x, "item4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem5(value: Double): Self = StObject.set(x, "item5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem6(value: Double): Self = StObject.set(x, "item6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPurchased(value: Double): Self = StObject.set(x, "itemsPurchased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillingSprees(value: Double): Self = StObject.set(x, "killingSprees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargestCriticalStrike(value: Double): Self = StObject.set(x, "largestCriticalStrike", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargestKillingSpree(value: Double): Self = StObject.set(x, "largestKillingSpree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargestMultiKill(value: Double): Self = StObject.set(x, "largestMultiKill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendaryItemsCreated(value: Double): Self = StObject.set(x, "legendaryItemsCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagicDamageDealtPlayer(value: Double): Self = StObject.set(x, "magicDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagicDamageDealtToChampions(value: Double): Self = StObject.set(x, "magicDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagicDamageTaken(value: Double): Self = StObject.set(x, "magicDamageTaken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinionsDenied(value: Double): Self = StObject.set(x, "minionsDenied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinionsKilled(value: Double): Self = StObject.set(x, "minionsKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralMinionsKilled(value: Double): Self = StObject.set(x, "neutralMinionsKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralMinionsKilledEnemyJungle(value: Double): Self = StObject.set(x, "neutralMinionsKilledEnemyJungle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralMinionsKilledYourJungle(value: Double): Self = StObject.set(x, "neutralMinionsKilledYourJungle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNexusKilled(value: Boolean): Self = StObject.set(x, "nexusKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeCapture(value: Double): Self = StObject.set(x, "nodeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeCaptureAssist(value: Double): Self = StObject.set(x, "nodeCaptureAssist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNeutralize(value: Double): Self = StObject.set(x, "nodeNeutralize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNeutralizeAssist(value: Double): Self = StObject.set(x, "nodeNeutralizeAssist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDeaths(value: Double): Self = StObject.set(x, "numDeaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumItemsBought(value: Double): Self = StObject.set(x, "numItemsBought", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectivePlayerScore(value: Double): Self = StObject.set(x, "objectivePlayerScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPentaKills(value: Double): Self = StObject.set(x, "pentaKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalDamageDealtPlayer(value: Double): Self = StObject.set(x, "physicalDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalDamageDealtToChampions(value: Double): Self = StObject.set(x, "physicalDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalDamageTaken(value: Double): Self = StObject.set(x, "physicalDamageTaken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerPosition(value: Double): Self = StObject.set(x, "playerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerRole(value: Double): Self = StObject.set(x, "playerRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadraKills(value: Double): Self = StObject.set(x, "quadraKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSightWardsBought(value: Double): Self = StObject.set(x, "sightWardsBought", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell1Cast(value: Double): Self = StObject.set(x, "spell1Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell2Cast(value: Double): Self = StObject.set(x, "spell2Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell3Cast(value: Double): Self = StObject.set(x, "spell3Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell4Cast(value: Double): Self = StObject.set(x, "spell4Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonSpell1Cast(value: Double): Self = StObject.set(x, "summonSpell1Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonSpell2Cast(value: Double): Self = StObject.set(x, "summonSpell2Cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperMonsterKilled(value: Double): Self = StObject.set(x, "superMonsterKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamObjective(value: Double): Self = StObject.set(x, "teamObjective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePlayed(value: Double): Self = StObject.set(x, "timePlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDamageDealt(value: Double): Self = StObject.set(x, "totalDamageDealt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDamageDealtToChampions(value: Double): Self = StObject.set(x, "totalDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDamageTaker(value: Double): Self = StObject.set(x, "totalDamageTaker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalHeal(value: Double): Self = StObject.set(x, "totalHeal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPlayerScore(value: Double): Self = StObject.set(x, "totalPlayerScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalScoreRank(value: Double): Self = StObject.set(x, "totalScoreRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTimeCrowdControlDealt(value: Double): Self = StObject.set(x, "totalTimeCrowdControlDealt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUnitsHealed(value: Double): Self = StObject.set(x, "totalUnitsHealed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTripleKills(value: Double): Self = StObject.set(x, "tripleKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrueDamageDealtPlayer(value: Double): Self = StObject.set(x, "trueDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrueDamageDealtToChampions(value: Double): Self = StObject.set(x, "trueDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrueDamageTaken(value: Double): Self = StObject.set(x, "trueDamageTaken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTurrentsKilled(value: Double): Self = StObject.set(x, "turrentsKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrealKills(value: Double): Self = StObject.set(x, "unrealKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVictoryPointTotal(value: Double): Self = StObject.set(x, "victoryPointTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisionWardsBought(value: Double): Self = StObject.set(x, "visionWardsBought", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWardKilled(value: Double): Self = StObject.set(x, "wardKilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWardPlaced(value: Double): Self = StObject.set(x, "wardPlaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecentGamesDto extends StObject {
    
    var games: js.Array[GameDto] = js.native
    
    var summonerId: Double = js.native
  }
  object RecentGamesDto {
    
    @scala.inline
    def apply(games: js.Array[GameDto], summonerId: Double): RecentGamesDto = {
      val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecentGamesDto]
    }
    
    @scala.inline
    implicit class RecentGamesDtoMutableBuilder[Self <: RecentGamesDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGames(value: js.Array[GameDto]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamesVarargs(value: GameDto*): Self = StObject.set(x, "games", js.Array(value :_*))
      
      @scala.inline
      def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    }
  }
}
