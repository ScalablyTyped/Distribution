organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-70c1a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-9e9935",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-7fbf06",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190507Z-fa46cd",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-99459e",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-432c03",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        