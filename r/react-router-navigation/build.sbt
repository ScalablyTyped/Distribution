organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-583df5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-9e9935",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190701Z-962be8",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190507Z-df3d18",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190613Z-498bce",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-8696b3",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        